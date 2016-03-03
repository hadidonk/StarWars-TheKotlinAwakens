package com.hugomatilla.starwars.domain.articles

import com.hugomatilla.starwars.domain.base.IUseCase
import com.hugomatilla.starwars.domain.exception.ErrorBundle
import com.hugomatilla.starwars.domain.model.ArticleDetailDomain

/**
 * Created by hugomatilla on 28/02/16.
 */

interface IGetArticlesListUseCase : IUseCase<IGetArticlesListUseCase.Callback> {

    interface Callback {
        fun onListLoaded(articles: Collection<ArticleDetailDomain>?)
        fun onError(error: ErrorBundle)
    }

    override fun execute(callback: Callback)
}