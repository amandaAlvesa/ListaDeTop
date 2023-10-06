import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import './ViewProduto.css'

export default function ViewProduto() {

    const{id}=useParams();

    const[produto, setProduto]=useState({
        name:"",
        description:"",
        image:""
    })

    const{name, description, image}=produto;

    const loadProduto = async()=> {
        const result= await axios.get(`http://localhost:1000/list/${id}`)
        setProduto(result.data)
      }   

    useEffect(()=>{
        loadProduto();
    },[]);

    return (
  <div className="container">
    <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
            <h2 className='text-center m-4'>Detalhes do Produto:</h2>
            <div className="card">
                <div className="card-header">
                    <ul className='list-group list-group-flush text-center'>
                        <li className='list-group-item'>
                            <b> Nome: </b>
                            <br />
                            {produto.name}
                        </li>
                    </ul>
                    <ul className='list-group list-group-flush text-center'>
                        <li className='list-group-item'>
                           <b> Posição: </b>
                           <br />
                           {produto.id} 
                        </li>
                    </ul>
                    <ul className='list-group list-group-flush text-center'>
                        <li className='list-group-item'> 
                           <b> Descrição: </b>
                            <br />
                            {produto.description}
                        </li>
                    </ul>
                    <ul className='list-group list-group-flush text-center'>
                        <li className='list-group-item'> 
                            <b> Imagem: </b>
                            <br />
                            <img src={produto.image} alt="Imagem" />
                        </li>
                    </ul>
                </div>
            </div>
            <Link className="btn btn-success my-2 mx-2" to={"/"}>Voltar</Link>
            <Link className='btn btn-info my-2' to={`/editproduto/${produto.id}`} >Editar</Link>
        </div>
    </div>
  </div>

  )
}
