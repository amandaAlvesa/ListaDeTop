import axios from 'axios';
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';

export default function AddProduto() {

    let navigate= useNavigate();

    const [produtos, setProdutos] =useState( {
        name: "",
        description: "",
        image: ""
    });

    const{name, description, image} = produtos;

    const onInputChange = (e) => {
        setProdutos({...produtos, [e.target.name]: e.target.value});
    }

    const onSubmit = async (e) => {
        e.preventDefault();
        await axios.post('http://localhost:1000/list', produtos);
        navigate("/");
    }
    
  return (
    <div className='conatiner'>
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className='text-center m-4'>Preencha o cadastro para novos produtos</h2>
                
                <form onSubmit={(e)=>onSubmit(e)}>

                <div className="mb-3">
                    <label htmlFor="Name" className='form-label'>Nome</label>
                    <input 
                        type={"text"} 
                        className='form-control' 
                        placeholder='insira o nome' 
                        name='name'
                        value={name}
                        onChange={(e)=>onInputChange((e))}
                    />
                    </div>
                    
                    <div className="mb-3">
                        <label htmlFor='description' className='form-label'>Descrição</label>
                        <input 
                            type={'text'}
                            className='form-control'
                            placeholder='Insira a Descrição'
                            name='description'
                            value={description}
                            onChange={(e)=>onInputChange((e))}
                        />
                    </div>
                    
                    <div className="mb-3">
                        <label htmlFor='image' className='form-label'>imagem</label>
                        <input 
                            type={'text'}
                            className='form-control'
                            placeholder='Insira o URL com o ".png"'
                            name='image'
                            value={image}
                            onChange={(e)=>onInputChange((e))}
                        />
                    </div>
                    <button className='btn btn-outline-success'>Adicionar</button>
                    <Link className='btn btn-outline-info mx-2' to={"/"}>Escolher posicao</Link>
                    <Link className='btn btn-outline-warning' to={"/"}>Cancelar</Link>
                 </form>
            </div>
        </div>
    </div>    
  )
}

