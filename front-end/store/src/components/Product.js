import React, { Component } from 'react'
import { Link } from 'react-router-dom'


class Product extends Component {

    render() {

        const { product } = this.props

        return (
            <div>
                <div className="card mb-4 shadow-sm">
                    <img className="card-img-top" src={product.image} alt="Card image cap" />
                    <div className="card-body">
                        <p className="card-text">{product.brand} {product.model}</p>
                        <div className="d-flex justify-content-between align-items-center">
                            <div className="btn-group">
                                <Link to={`/ProductDescription/${product.id}`}>
                                    <button type="button" class="btn btn-outline-info">View</button>
                                </Link>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Product
