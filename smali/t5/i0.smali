.class public final enum Lt5/i0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/b0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt5/i0;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/b0$c;"
    }
.end annotation


# static fields
.field public static final enum k:Lt5/i0;

.field public static final enum l:Lt5/i0;

.field public static final enum m:Lt5/i0;

.field public static final enum n:Lt5/i0;

.field public static final enum o:Lt5/i0;

.field public static final enum p:Lt5/i0;

.field private static final q:Lcom/google/crypto/tink/shaded/protobuf/b0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/b0$d<",
            "Lt5/i0;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic r:[Lt5/i0;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lt5/i0;

    const-string v1, "UNKNOWN_PREFIX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lt5/i0;->k:Lt5/i0;

    new-instance v1, Lt5/i0;

    const-string v3, "TINK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lt5/i0;->l:Lt5/i0;

    new-instance v3, Lt5/i0;

    const-string v5, "LEGACY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lt5/i0;->m:Lt5/i0;

    new-instance v5, Lt5/i0;

    const-string v7, "RAW"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lt5/i0;->n:Lt5/i0;

    new-instance v7, Lt5/i0;

    const-string v9, "CRUNCHY"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lt5/i0;->o:Lt5/i0;

    new-instance v9, Lt5/i0;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lt5/i0;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lt5/i0;->p:Lt5/i0;

    const/4 v11, 0x6

    new-array v11, v11, [Lt5/i0;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lt5/i0;->r:[Lt5/i0;

    new-instance v0, Lt5/i0$a;

    invoke-direct {v0}, Lt5/i0$a;-><init>()V

    sput-object v0, Lt5/i0;->q:Lcom/google/crypto/tink/shaded/protobuf/b0$d;

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

    iput p3, p0, Lt5/i0;->j:I

    return-void
.end method

.method public static b(I)Lt5/i0;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lt5/i0;->o:Lt5/i0;

    return-object p0

    :cond_1
    sget-object p0, Lt5/i0;->n:Lt5/i0;

    return-object p0

    :cond_2
    sget-object p0, Lt5/i0;->m:Lt5/i0;

    return-object p0

    :cond_3
    sget-object p0, Lt5/i0;->l:Lt5/i0;

    return-object p0

    :cond_4
    sget-object p0, Lt5/i0;->k:Lt5/i0;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lt5/i0;
    .locals 1

    const-class v0, Lt5/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt5/i0;

    return-object p0
.end method

.method public static values()[Lt5/i0;
    .locals 1

    sget-object v0, Lt5/i0;->r:[Lt5/i0;

    invoke-virtual {v0}, [Lt5/i0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt5/i0;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lt5/i0;->p:Lt5/i0;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lt5/i0;->j:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
