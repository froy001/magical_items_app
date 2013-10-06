package com.froy.magicalitem.dao;

import com.froy.magicalitem.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table ITEM_SPELLS.
 */
public class ItemSpells {

    private Long id;
    private Long itemId;
    private Long spellId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ItemSpellsDao myDao;

    private MagicalItems item;
    private Long item__resolvedKey;

    private Spells itemSpells;
    private Long itemSpells__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public ItemSpells() {
    }

    public ItemSpells(Long id) {
        this.id = id;
    }

    public ItemSpells(Long id, Long itemId, Long spellId) {
        this.id = id;
        this.itemId = itemId;
        this.spellId = spellId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getItemSpellsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getSpellId() {
        return spellId;
    }

    public void setSpellId(Long spellId) {
        this.spellId = spellId;
    }

    /** To-one relationship, resolved on first access. */
    public MagicalItems getItem() {
        Long __key = this.itemId;
        if (item__resolvedKey == null || !item__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MagicalItemsDao targetDao = daoSession.getMagicalItemsDao();
            MagicalItems itemNew = targetDao.load(__key);
            synchronized (this) {
                item = itemNew;
            	item__resolvedKey = __key;
            }
        }
        return item;
    }

    public void setItem(MagicalItems item) {
        synchronized (this) {
            this.item = item;
            itemId = item == null ? null : item.getId();
            item__resolvedKey = itemId;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Spells getItemSpells() {
        Long __key = this.spellId;
        if (itemSpells__resolvedKey == null || !itemSpells__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SpellsDao targetDao = daoSession.getSpellsDao();
            Spells itemSpellsNew = targetDao.load(__key);
            synchronized (this) {
                itemSpells = itemSpellsNew;
            	itemSpells__resolvedKey = __key;
            }
        }
        return itemSpells;
    }

    public void setItemSpells(Spells itemSpells) {
        synchronized (this) {
            this.itemSpells = itemSpells;
            spellId = itemSpells == null ? null : itemSpells.getId();
            itemSpells__resolvedKey = spellId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}