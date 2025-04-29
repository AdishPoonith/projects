.class final Lcom/google/crypto/tink/shaded/protobuf/i$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation


# instance fields
.field private final a:Lcom/google/crypto/tink/shaded/protobuf/l;

.field private final b:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$h;->b:[B

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->d0([B)Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$h;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/crypto/tink/shaded/protobuf/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i$h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i$h;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->c()V

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i$j;

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$h;->b:[B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i$j;-><init>([B)V

    return-object v0
.end method

.method public b()Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i$h;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-object v0
.end method
