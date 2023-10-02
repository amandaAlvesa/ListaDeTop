import React, { useState } from 'react'
import './Home.css'
import axios from 'axios'

export default function () {

    const [produto, setProduto] =useState([]);

  return (
    <div className="container">
         <div className="py-4">
            <table className="table border shadow">
                <thead>
                    <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    </tr>
                </tbody>
                </table>
        </div>
    </div>
    )
}
