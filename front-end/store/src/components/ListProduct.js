import React, { Component } from 'react';
import Product from './Product'

class ListProduct extends Component {



    render() {

        const { products } = this.props

        return (
            <div>
                <div className="album py-5 bg-light">
                    <div className="container">
                        <div className="row">
                            {
                                products.map(product => <Product key={product.id} product={product} />)
                            }
                        </div>
                    </div>
                </div>
            </div>
        )

    }


}

export default ListProduct



