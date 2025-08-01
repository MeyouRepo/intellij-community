from collections.abc import Sequence
from typing import Any

from django.db.backends.base.base import BaseDatabaseWrapper
from django.db.models.expressions import BaseExpression, Combinable, Expression, OrderByList
from django.db.models.sql.compiler import SQLCompiler, _AsSqlType

class OrderableAggMixin:
    order_by: OrderByList
    def __init__(
        self,
        *expressions: BaseExpression | Combinable | str,
        ordering: Sequence[str] = ...,
        order_by: Sequence[str] = ...,
        **extra: Any,
    ) -> None: ...
    def get_source_expressions(self) -> list[Expression]: ...
    def set_source_expressions(self, exprs: Sequence[Combinable]) -> None: ...
    def as_sql(self, compiler: SQLCompiler, connection: BaseDatabaseWrapper) -> _AsSqlType: ...
