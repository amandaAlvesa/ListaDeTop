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
            <table className="table border shadow">
                <thead>
                    <tr>
                    <th scope="col">#</th>
                    <th scope="col">Produto</th>
                    <th scope="col">Descrição</th>
                    <th scope="col">Img</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        produto.map((produto, index) =>(
                            <tr>
                                <th scope="row" key={index}>{index + 1}</th>
                                <td>{produto.name}</td>
                                <td>{produto.description}</td>
                                <img src={produto.image} alt="Imagem" />
                                
                            </tr>
                        ))
                    }
                    
                </tbody>
                </table>
        </div>
    </div>
    )
}
