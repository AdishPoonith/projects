.class public final Lt5/c$b;
.super Lcom/google/crypto/tink/shaded/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
        "Lt5/c;",
        "Lt5/c$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lt5/c;->N()Lt5/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lt5/c$a;)V
    .locals 0

    invoke-direct {p0}, Lt5/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(I)Lt5/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/c;

    invoke-static {v0, p1}, Lt5/c;->O(Lt5/c;I)V

    return-object p0
.end method
