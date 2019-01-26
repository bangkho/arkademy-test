SELECT
	product_categories.id,
	product_categories.`name`,
	Count( products.category_id ) as Jumlah_product
FROM
	product_categories
	INNER JOIN products ON products.category_id = product_categories.id
GROUP BY
	product_categories.id