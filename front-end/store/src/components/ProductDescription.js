import React, { Component } from 'react'
import * as ProductAPI from '../ProductAPI'


class ProductDescription extends Component {

    state = {
        product: {}
    }

fetchProduct(id) {
    ProductAPI.getProductByID(Number(id)).then((product) => {
        this.setState({
            product
        })
    })
}

    render() {
        
        let pp
        const id = this.props.match.params.id

        this.fetchProduct(id)
        
        //console.log('Product detail', p)

        return (

            <div>
                <div className="container">

                    <h1 className="my-4">{this.state.product.brand}
                    <small> {this.state.product.model}</small>
                    </h1>

                    <div className="row">

                        <div className="col-md-8">
                            <img className="img-fluid" src={this.state.product.image} alt="" />
                        </div>

                        <div className="col-md-4">
                            <h3 className="my-3">Description</h3>
                            <p>{this.state.product.description}</p>
                            <h3 className="my-3">Details</h3>
                            <ul>
                                <li>Price: {this.state.product.price} $</li>
                                <li>{this.state.product.quantity} remaining</li>
                            </ul>
                            <button type="button" class="btn btn-outline-primary btn-lg">Buy</button>
                        </div>
                    </div>
                </div>
            </div>



        )
    }


}

export default ProductDescription