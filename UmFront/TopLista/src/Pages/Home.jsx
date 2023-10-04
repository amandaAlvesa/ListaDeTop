import React, { useEffect, useState } from 'react'
import './Home.css'
import axios from 'axios'

export default function () {

    useEffect(()=>{
        loadProduto();
    },[])

    const [produto, setProduto] =useState([]);

    const loadProduto = async()=>{
        const result = await axios.get('http://localhost:1000/list')
        setProduto(result.data)
    }

  return (
    <div className="container">
         <div className="py-4">
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
                                    <button className='btn btn-success mx-2'>Visualizar</button>
                                    <button className='btn btn-outline-info mx-2'>Editar</button>
                                    <button className='btn btn-warning mx-2' >Remover</button>
                                </td>
                                
                            </tr>
                        ))
                    }
                    
                </tbody>
                </table>
        </div>
    </div>
    )
}
