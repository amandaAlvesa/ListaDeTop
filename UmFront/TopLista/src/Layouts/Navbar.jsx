import React from 'react'
import "./Navbar.css"
import { Link } from 'react-router-dom'

export default function Navbar() {

  return (
    <div>
      <nav className="navbar navbar-expand-lg data-theme='light'">
         <div className="container-fluid">
              <a className="navbar-brand" href='/' >Tops</a>
              <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span className="navbar-toggler-icon"></span>
              </button>
         
          
            <Link className="btn" to={'/addproduto'}> + um pro Ranking</Link> 
         </div>
      </nav>  
    </div>
  )
}