import React, { Component } from 'react'
import Header from './components/Header'
import Footer from './components/Footer'
import ListProduct from './components/ListProduct'
import ProductDescription from './components/ProductDescription'
import * as ProductAPI from './ProductAPI'
import { Route, Link } from 'react-router-dom'


class App extends Component {

  state = {
    products: []
  }

  componentDidMount() {
    this.fetchData();
  }


  fetchData() {
    ProductAPI.getAllProducts().then((products) => {
      this.setState({
        products
      })
    });
  }


  render() {
    return (
      <div className="App">
        <Header />

        <Route exact path="/" render={() => (
          <div>
            <ListProduct products={this.state.products} />
          </div>
        )} />



        <Route path="/ProductDescription/:id" render={( params ) => (
          <ProductDescription {...params} />
        )} />


        <Footer />
      </div>
    );
  }
}

export default App;
