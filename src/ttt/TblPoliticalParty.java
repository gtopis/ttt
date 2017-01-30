/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author george
 */
@Entity
@Table(name = "TBL_POLITICAL_PARTY", catalog = "", schema = "ADMIN2")
@NamedQueries({
    @NamedQuery(name = "TblPoliticalParty.findAll", query = "SELECT t FROM TblPoliticalParty t")
    , @NamedQuery(name = "TblPoliticalParty.findByPkPartyId", query = "SELECT t FROM TblPoliticalParty t WHERE t.pkPartyId = :pkPartyId")
    , @NamedQuery(name = "TblPoliticalParty.findByFldTitle", query = "SELECT t FROM TblPoliticalParty t WHERE t.fldTitle = :fldTitle")
    , @NamedQuery(name = "TblPoliticalParty.findByFldLeaderfullname", query = "SELECT t FROM TblPoliticalParty t WHERE t.fldLeaderfullname = :fldLeaderfullname")
    , @NamedQuery(name = "TblPoliticalParty.findByFkElectoralPeripheryId", query = "SELECT t FROM TblPoliticalParty t WHERE t.fkElectoralPeripheryId = :fkElectoralPeripheryId")})
public class TblPoliticalParty implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PK_PARTY_ID")
    private Integer pkPartyId;
    @Basic(optional = false)
    @Column(name = "FLD_TITLE")
    private String fldTitle;
    @Basic(optional = false)
    @Column(name = "FLD_LEADERFULLNAME")
    private String fldLeaderfullname;
    @Basic(optional = false)
    @Column(name = "FK_ELECTORAL_PERIPHERY_ID")
    private int fkElectoralPeripheryId;

    public TblPoliticalParty() {
    }

    public TblPoliticalParty(Integer pkPartyId) {
        this.pkPartyId = pkPartyId;
    }

    public TblPoliticalParty(Integer pkPartyId, String fldTitle, String fldLeaderfullname, int fkElectoralPeripheryId) {
        this.pkPartyId = pkPartyId;
        this.fldTitle = fldTitle;
        this.fldLeaderfullname = fldLeaderfullname;
        this.fkElectoralPeripheryId = fkElectoralPeripheryId;
    }

    public Integer getPkPartyId() {
        return pkPartyId;
    }

    public void setPkPartyId(Integer pkPartyId) {
        Integer oldPkPartyId = this.pkPartyId;
        this.pkPartyId = pkPartyId;
        changeSupport.firePropertyChange("pkPartyId", oldPkPartyId, pkPartyId);
    }

    public String getFldTitle() {
        return fldTitle;
    }

    public void setFldTitle(String fldTitle) {
        String oldFldTitle = this.fldTitle;
        this.fldTitle = fldTitle;
        changeSupport.firePropertyChange("fldTitle", oldFldTitle, fldTitle);
    }

    public String getFldLeaderfullname() {
        return fldLeaderfullname;
    }

    public void setFldLeaderfullname(String fldLeaderfullname) {
        String oldFldLeaderfullname = this.fldLeaderfullname;
        this.fldLeaderfullname = fldLeaderfullname;
        changeSupport.firePropertyChange("fldLeaderfullname", oldFldLeaderfullname, fldLeaderfullname);
    }

    public int getFkElectoralPeripheryId() {
        return fkElectoralPeripheryId;
    }

    public void setFkElectoralPeripheryId(int fkElectoralPeripheryId) {
        int oldFkElectoralPeripheryId = this.fkElectoralPeripheryId;
        this.fkElectoralPeripheryId = fkElectoralPeripheryId;
        changeSupport.firePropertyChange("fkElectoralPeripheryId", oldFkElectoralPeripheryId, fkElectoralPeripheryId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPartyId != null ? pkPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPoliticalParty)) {
            return false;
        }
        TblPoliticalParty other = (TblPoliticalParty) object;
        if ((this.pkPartyId == null && other.pkPartyId != null) || (this.pkPartyId != null && !this.pkPartyId.equals(other.pkPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ttt.TblPoliticalParty[ pkPartyId=" + pkPartyId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
