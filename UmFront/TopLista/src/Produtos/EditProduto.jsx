import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';


export default function EditProduto() {

    const {id}=useParams();

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
        await axios.put(`http://localhost:1000/list/${id}`, produtos);
        navigate("/");
    }

    const loadProduto = async()=> {
      const result= await axios.get(`http://localhost:1000/list/${id}`)
      setProdutos(result.data)
    }   

    useEffect(()=>{
        loadProduto();
    }, [])

  return (
    <div className='conatiner'>
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className='text-center m-4'>Editar produto</h2>
                
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
                    <button className='btn btn-success'>Editar</button>
                    <Link className='btn btn-info mx-2' to={"/"}>Escolher posicao</Link>
                    <Link className='btn btn-warning' to={"/"}>Cancelar</Link>
                 </form>
            </div>
        </div>
    </div>    
  )
}

