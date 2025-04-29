.class Lna/a$b;
.super Lna/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lna/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lna/o<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final m:Lna/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna/a$a<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final n:Lla/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lla/l<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lna/a$a;Lla/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna/a$a<",
            "TE;>;",
            "Lla/l<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lna/o;-><init>()V

    iput-object p1, p0, Lna/a$b;->m:Lna/a$a;

    iput-object p2, p0, Lna/a$b;->n:Lla/l;

    return-void
.end method


# virtual methods
.method public B(Lna/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna/j<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p1, Lna/j;->m:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lna/a$b;->n:Lla/l;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lla/l$a;->a(Lla/l;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lna/a$b;->n:Lla/l;

    invoke-virtual {p1}, Lna/j;->G()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lla/l;->o(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lna/a$b;->m:Lna/a$a;

    invoke-virtual {v1, p1}, Lna/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lna/a$b;->n:Lla/l;

    invoke-interface {p1, v0}, Lla/l;->p(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public C(Ljava/lang/Object;)Lda/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lda/l<",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lna/a$b;->m:Lna/a$a;

    iget-object v0, v0, Lna/a$a;->a:Lna/a;

    iget-object v0, v0, Lna/c;->b:Lda/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lna/a$b;->n:Lla/l;

    invoke-interface {v1}, Lv9/d;->getContext()Lv9/g;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkotlinx/coroutines/internal/v;->a(Lda/l;Ljava/lang/Object;Lv9/g;)Lda/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    iget-object v0, p0, Lna/a$b;->m:Lna/a$a;

    invoke-virtual {v0, p1}, Lna/a$a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lna/a$b;->n:Lla/l;

    sget-object v0, Lla/n;->a:Lkotlinx/coroutines/internal/b0;

    invoke-interface {p1, v0}, Lla/l;->p(Ljava/lang/Object;)V

    return-void
.end method

.method public f(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/b0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/o$b;",
            ")",
            "Lkotlinx/coroutines/internal/b0;"
        }
    .end annotation

    iget-object p2, p0, Lna/a$b;->n:Lla/l;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lna/a$b;->C(Ljava/lang/Object;)Lda/l;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1, p1}, Lla/l;->d(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    sget-object p1, Lla/n;->a:Lkotlinx/coroutines/internal/b0;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveHasNext@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lla/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
