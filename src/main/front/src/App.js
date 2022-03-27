import logo from './logo.svg';
import './App.css';
import {Link, Route, Router, Routes} from "react-router-dom";
import MainLayout from "./layout/MainLayout";
import Home from "./pages/Home";

function App() {
  return (
      <>
        <Routes>
          <Route path="/" element={<MainLayout children={<Home/>}/>}>
          </Route>
        </Routes>
      </>
  );
}

export default App;
