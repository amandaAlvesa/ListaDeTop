import React from 'react'
import { Link } from 'react-router-dom'

export default function InitialPage() {
  return (
        <div className='conatiner'>
            <div className="row">
                <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">    
                    <div>Ordene Seus Tops Por Posição</div>
                    <Link className='btn btn-success mx-2' to={'/topcores'} > Top Cores</Link>
                    <Link className='btn btn-success' to={'/topcomidas'} > Top Comidas</Link>
                </div>
            </div>
        </div>
  )
}
