import { Routes,Route } from 'react-router'
import Home from './pages/home/Home'
import './App.css'

function App() {

  return (
  <>
    <BrowserRouter>
        <Router>
            <Routes>
                <Route path="/" element={<Home/>}></Route>
            </Routes>
        </Router>
    </BrowserRouter>
  </>
  )
}

export default App
