.class public final enum Lt5/u;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/b0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt5/u;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/b0$c;"
    }
.end annotation


# static fields
.field public static final enum k:Lt5/u;

.field public static final enum l:Lt5/u;

.field public static final enum m:Lt5/u;

.field public static final enum n:Lt5/u;

.field public static final enum o:Lt5/u;

.field public static final enum p:Lt5/u;

.field public static final enum q:Lt5/u;

.field private static final r:Lcom/google/crypto/tink/shaded/protobuf/b0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/b0$d<",
            "Lt5/u;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic s:[Lt5/u;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lt5/u;

    const-string v1, "UNKNOWN_HASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lt5/u;->k:Lt5/u;

    new-instance v1, Lt5/u;

    const-string v3, "SHA1"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lt5/u;->l:Lt5/u;

    new-instance v3, Lt5/u;

    const-string v5, "SHA384"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lt5/u;->m:Lt5/u;

    new-instance v5, Lt5/u;

    const-string v7, "SHA256"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lt5/u;->n:Lt5/u;

    new-instance v7, Lt5/u;

    const-string v9, "SHA512"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lt5/u;->o:Lt5/u;

    new-instance v9, Lt5/u;

    const-string v11, "SHA224"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lt5/u;->p:Lt5/u;

    new-instance v11, Lt5/u;

    const-string v13, "UNRECOGNIZED"

    const/4 v14, 0x6

    const/4 v15, -0x1

    invoke-direct {v11, v13, v14, v15}, Lt5/u;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lt5/u;->q:Lt5/u;

    const/4 v13, 0x7

    new-array v13, v13, [Lt5/u;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lt5/u;->s:[Lt5/u;

    new-instance v0, Lt5/u$a;

    invoke-direct {v0}, Lt5/u$a;-><init>()V

    sput-object v0, Lt5/u;->r:Lcom/google/crypto/tink/shaded/protobuf/b0$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lt5/u;->j:I

    return-void
.end method

.method public static b(I)Lt5/u;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lt5/u;->p:Lt5/u;

    return-object p0

    :cond_1
    sget-object p0, Lt5/u;->o:Lt5/u;

    return-object p0

    :cond_2
    sget-object p0, Lt5/u;->n:Lt5/u;

    return-object p0

    :cond_3
    sget-object p0, Lt5/u;->m:Lt5/u;

    return-object p0

    :cond_4
    sget-object p0, Lt5/u;->l:Lt5/u;

    return-object p0

    :cond_5
    sget-object p0, Lt5/u;->k:Lt5/u;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lt5/u;
    .locals 1

    const-class v0, Lt5/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt5/u;

    return-object p0
.end method

.method public static values()[Lt5/u;
    .locals 1

    sget-object v0, Lt5/u;->s:[Lt5/u;

    invoke-virtual {v0}, [Lt5/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt5/u;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lt5/u;->q:Lt5/u;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lt5/u;->j:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
