package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAllByUser(User user, Pageable pageable);

//    select
//        p.id,
//        p.title as product_title,
//        pf.product_id as product_id,
//        pf.folder_id as folder_id
//    from
//            product p left join product_folder pf
//                on p.id = pf.product_id
//    where p.user_id = 1
//        and
//        pf.folder_id = 3
//    order by p.id
//        limit 12, 10; // 12번 부터 10개씩(이건 참조)
    // 사용자가 가진 상품 중에
    // product에 양방향으로 잡힌 productFolderList의 Folder의 folder_id를 기준으로 가져온다.
    Page<Product> findAllByUserAndProductFolderList_FolderId(User user, Long folderId, Pageable pageable);

}
