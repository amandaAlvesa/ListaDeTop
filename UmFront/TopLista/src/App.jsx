import './App.css'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './Layouts/Navbar';
import Home from './Pages/Home';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import AddProduto from './Produtos/AddProduto';
import EditProduto from './Produtos/EditProduto';
import ViewProduto from './Produtos/ViewProduto';
import InitialPage from './Pages/InitialPage';
import Comidas from './Pages/Comidas';


function App() {
  return (
   <div className='app'>
      <Router>
        <Navbar />
        <Routes>
          <Route exact path='/topcores' element={<Home/>} />
          <Route exact path='/topcomidas' element={<Comidas/>} />
          <Route exact path='/addproduto' element={<AddProduto/>} />
          <Route exact path='/editproduto/:id' element={<EditProduto/>} />
          <Route exact path='/viewproduto/:id' element={<ViewProduto/>} />
          <Route exact path='/' element={<InitialPage/>} />
        </Routes>
      </Router>
    </div>
  )
}

export default App
