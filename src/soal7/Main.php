<?php
/**
 * Created by PhpStorm.
 * User: bangk
 * Date: 1/26/2019
 * Time: 10:14 AM
 */
require_once('Connection.php');

class Main{
    private $con;

    function __construct()
    {
        $this->con = new Connection();
    }

    function Main(){
        $query = "SELECT product_categories.id, product_categories.name, count(products.category_id) as Jumlah_product
         FROM product_categories INNER JOIN products ON products.category_id = product_categories.id
         GROUP BY product_categories.id
        ";
        $result = mysqli_query($this->con->Connect(), $query);

        $html="";
        while($product = mysqli_fetch_object($result)){
            $html .= "
                <tr>
                    <td>".$product->id."</td>
                    <td>".$product->name."</td>
                    <td>".$product->Jumlah_product." Jenis</td>
                </tr>
            ";
        }
        echo $html;
    }
}

require_once('header.php');
$main = new Main();
$main->Main();
require_once('footer.php');