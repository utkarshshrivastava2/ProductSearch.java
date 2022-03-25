package com.sebone.java.searchproduct.fasade;

import java.util.List;

import com.sebone.java.searchproduct.ProductData;
import com.sebone.java.searchproduct.ProductSearchResponse;

public interface ProductSearch {

		/* OBJECTIVE- To search a product By using a keyword
		 * METHOD:- getProductByKeyword()
		 * PARAM:-  String keyword ,String sortBy
		 * RETURN OBJECT:- List<ProductData> */   
	   List<ProductData>  getProductByKeyword(String keyword, String sortby);      
	          

	    /*OBJECTIVE - To  search  the product based on price//this should be 
	     *METHOD:- getProductsByPrice()
	     *PARAM:- Integer Price, String keyword // it should be Under price a also (Ranging)
	     *RETURN OBJECT:List<productSearchResponse>  */
	    
	   List<ProductSearchResponse> getProductByPrice(String keyword,int productPrice);

	   /*OBJECTIVE - To  search products based on its discount nature                            
	 	*METHOD:- getProductsByDiscount()
	    *PARAM:- string  Discount type , String keyword , // productName
	    *RETURN OBJECT:-List<productSearchResponse> */
	   
	   List<ProductSearchResponse> getProductByDiscount(String discountype, String keyword);
	   
	   /*
	    *OBJECTIVE - To search products based on rating.
	    *METHOD:- SortProductsByRating()
	    *PARAM:-   int rating, string ProductName
	    *RETURN OBJECT:-productSearchResponse
	    UsedCase= If user searches product by rating which is not available then it will show */
	   
	   List<ProductSearchResponse> getProductByRating(int rating, String productName);


	  	/* OBJECTIVE: To search the product by Shipping type whether 
	     * It is free shipping  or paid.       
	     * METHOD:- getProductsByShippingType()
	     * PARAM:- string shippingType , string name//productname
	     * RETURN OBJECT:-productSearchResponse*/
	   
	   List<ProductSearchResponse> getProductByShippingType(String productName, String shippingType);

	     /* OBJECTIVE : to sort the product based on price
	      * METHOD : sortProductByPrice()
	      * PARAM- string product name, int price , int choice// 1- low to high,2- high to low
	      * RETURN OBJECT :- List<ProductData>*/
	   
	   List<ProductData>sortProductByPrice(int productName, int productPrice, int choice);

	                                          
	     /* OBJECTIVE : to sort the product based on discount
	      * METHOD : sortProductByDiscount()
	      *	PARAM- string product name, int  discount  , int choice// 1- low to high,2- high to low
	      * RETURN OBJECT :- List<ProductData>*/
	   
	   List<ProductData>sortByProductByDiscount(String productName, int discount,int choice);
	   
	   
         /* OBJECTIVE : to sort the product based on rating
	      * METHOD : sortProductByRating()
	      * PARAM- string product name, int  rating  , int choice// 1- low to high,2- high to low
	      * RETURN OBJECT :- List<ProductData>*/ 
	   
	   List<ProductData>sortProductByRating(String productName, int productRating, int choice);

	   
	     /* OBJECTIVE :  to sort the product based on shipping price
	      * METHOD : sortProductByShippingPrice()
	      * PARAM- string product name, int  shippingPrice  , int choice// 1- low to high,2- high to low
	      * RETURN OBJECT :- List<ProductData> */
	   
	   List<ProductData>sortByShippingPrice(String productName , int shippingPrice,int choice);


	
}
