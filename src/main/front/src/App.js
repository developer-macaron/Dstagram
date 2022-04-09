import './App.css';
import {Routes, Route} from "react-router-dom";
import MainLayout from "./layout/MainLayout";
import {ROUTE} from "./type/menu";
import React from "react";

function App() {
  return (
      <>
          <Routes>
              {Object.values(ROUTE).map(({ url, component }, index) => (
                  <Route exact key={index} path={url} element={<MainLayout children={component}/>} />
              ))}
          </Routes>
      </>
  );
}

export default App;
