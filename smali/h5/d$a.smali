.class Lh5/d$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lu5/l;",
        "Lt5/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/k;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt5/f;

    invoke-virtual {p0, p1}, Lh5/d$a;->c(Lt5/f;)Lu5/l;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/f;)Lu5/l;
    .locals 2

    new-instance v0, Lu5/a;

    invoke-virtual {p1}, Lt5/f;->S()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object v1

    invoke-virtual {p1}, Lt5/f;->T()Lt5/h;

    move-result-object p1

    invoke-virtual {p1}, Lt5/h;->Q()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lu5/a;-><init>([BI)V

    return-object v0
.end method
