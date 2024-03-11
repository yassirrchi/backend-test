package com.peacock.backend.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;


public record BillDTO(Long client_id, Date dateFacture, List<BillItemDTO> billItems,Long bill_id) {
}
