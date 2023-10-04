import './App.css'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './Layouts/Navbar';
import Home from './Pages/Home';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import AddProduto from './Produtos/AddProduto';

function App() {

  return (
   <div className='app'>
      <Router>
        <Navbar />
        <Routes>
          <Route exact path='/' element={<Home/>} />
          <Route exact path='/addproduto' element={<AddProduto/>} />
        </Routes>
      </Router>
    </div>
  )
}

export default App
