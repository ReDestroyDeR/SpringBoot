package org.example.product.application;

import org.example.product.dto.RequestProductDTO;
import org.example.product.dto.ResponseProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ResponseProductDTO create(RequestProductDTO requestProductDTO);

    Optional<ResponseProductDTO> read(Long id);

    void update(Long id, RequestProductDTO requestProductDTO);

    void delete(Long id);

    List<ResponseProductDTO> readAll();
}