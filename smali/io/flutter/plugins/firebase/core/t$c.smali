.class Lio/flutter/plugins/firebase/core/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/l$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/core/t;->d(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr8/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/plugins/firebase/core/l$h<",
        "Lio/flutter/plugins/firebase/core/l$f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lr8/a$e;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lr8/a$e;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr8/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/firebase/core/l$f;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/core/t$c;->c(Lio/flutter/plugins/firebase/core/l$f;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr8/a$e;

    invoke-interface {v0, p1}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lio/flutter/plugins/firebase/core/l$f;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr8/a$e;

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
