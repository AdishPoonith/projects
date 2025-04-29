.class public abstract Lcom/google/crypto/tink/shaded/protobuf/z$a;
.super Lcom/google/crypto/tink/shaded/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/crypto/tink/shaded/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final j:Lcom/google/crypto/tink/shaded/protobuf/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected k:Lcom/google/crypto/tink/shaded/protobuf/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected l:Z


# direct methods
.method protected constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->j:Lcom/google/crypto/tink/shaded/protobuf/z;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->m:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->l:Z

    return-void
.end method

.method private A(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->x()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->u()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->t()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic o(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->y(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object p1

    return-object p1
.end method

.method public final s()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->t()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->r(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v0

    throw v0
.end method

.method public t()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->C()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->l:Z

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0
.end method

.method public u()Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->x()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->E()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->t()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->z(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;

    return-object v0
.end method

.method protected final v()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->l:Z

    :cond_0
    return-void
.end method

.method protected w()V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/z$f;->m:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->A(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-void
.end method

.method public x()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->j:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0
.end method

.method protected y(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->z(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object p1

    return-object p1
.end method

.method public z(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-direct {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->A(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-object p0
.end method
