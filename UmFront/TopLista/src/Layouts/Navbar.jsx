import React from 'react'
import "./Navbar.css"

export default function Navbar() {
  return (
    <div>
      <nav className="navbar navbar-expand-lg">
         <div className="container-fluid">
              <a className="navbar-brand" >Tops</a>
              <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span className="navbar-toggler-icon"></span>
              </button>
         
          <button className="btn"> + um pro Ranking</button> 
         </div>
      </nav>  
    </div>
  )
}