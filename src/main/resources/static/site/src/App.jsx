import { Routes,Route,BrowserRouter } from 'react-router-dom'
import Home from './pages/home/Home'
import './App.css'
import Shop from './pages/home/Shop'
import UserList from './pages/userList/UserList'

function App() {

  return (
  <>
    <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>}></Route>
                <Route path="/123" element={<Shop/>}></Route>
                <Route path="/users" element={<UserList/>}></Route>
            </Routes>
    </BrowserRouter>
  </>
  )
}

export default App
