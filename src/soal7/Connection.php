<?php
/**
 * Created by PhpStorm.
 * User: bangk
 * Date: 1/26/2019
 * Time: 10:12 AM
 */

class Connection{
    function Connect(){
        $hostname 	= 'localhost';
        $username 	= 'root';
        $password 	= '';
        $dbname 	= 'arkademy_test';

        $db = mysqli_connect( $hostname , $username , $password , $dbname );

       return $db;
    }
}
