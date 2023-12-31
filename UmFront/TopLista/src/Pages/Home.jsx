import React, { useEffect, useState } from 'react'
import './Home.css'
import axios from 'axios'
import { Link, useParams } from 'react-router-dom';

export default function () {

    const {id} = useParams();

    useEffect(()=>{
        loadProduto();
    },[])

    const [produto, setProduto] =useState([]);

    const loadProduto = async()=> {
        const result = await axios.get('http://localhost:1000/list/1/produtos')
        setProduto(result.data)
    }

    const deleteProduto = async(id)=> {
        await axios.delete(`http://localhost:1000/list/${id}`)
        loadProduto();
    }

  return (
    <div className="container">
         <div className="py-4">
         <div className="nometop border rounded p-4 mt-2 shadow">Top de Cores</div>

            <table className="table table table-sm border shadow">
                <thead>
                    <tr className='descricao'>
                    <th scope="col">Ranking</th>
                    <th scope="col">Produto</th>
                    <th scope="col">Descrição</th>
                    <th scope="col">Imagem</th>
                    <th scope='col'>Ação</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        produto.map((produto, index) =>(
                            <tr className='objs'>
                                <th scope="row" key={index}>{index + 1}</th>
                                <td>{produto.name}</td>
                                <td>{produto.description}</td>
                                <img src={produto.image} alt="Imagem" />

                                <td>
                                    <Link className='btn btn-success mx-2' to={`/viewproduto/${produto.id}`}>Visualizar</Link>
                                    <Link className='btn btn-info mx-2' to={`/editproduto/${produto.id}`}>Editar</Link>
                                    <button className='btn btn-warning mx-2' onClick={() => (deleteProduto(produto.id))}>Remover</button>
                                </td>
                                
                            </tr>
                            
                        ))
                        
                    }
                                  <Link className="btn btn-dark bs-primary-text-emphasis" to={'/addproduto'} > + um pro Ranking</Link> 
  
                </tbody>

                </table>
        </div>
    </div>
    )
}
