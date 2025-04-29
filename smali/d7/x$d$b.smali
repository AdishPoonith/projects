.class public final enum Ld7/x$d$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/d0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/x$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld7/x$d$b;",
        ">;",
        "Lcom/google/protobuf/d0$c;"
    }
.end annotation


# static fields
.field public static final enum k:Ld7/x$d$b;

.field public static final enum l:Ld7/x$d$b;

.field public static final enum m:Ld7/x$d$b;

.field public static final enum n:Ld7/x$d$b;

.field private static final o:Lcom/google/protobuf/d0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$d<",
            "Ld7/x$d$b;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic p:[Ld7/x$d$b;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ld7/x$d$b;

    const-string v1, "OPERATOR_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ld7/x$d$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld7/x$d$b;->k:Ld7/x$d$b;

    new-instance v1, Ld7/x$d$b;

    const-string v3, "AND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ld7/x$d$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ld7/x$d$b;->l:Ld7/x$d$b;

    new-instance v3, Ld7/x$d$b;

    const-string v5, "OR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Ld7/x$d$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ld7/x$d$b;->m:Ld7/x$d$b;

    new-instance v5, Ld7/x$d$b;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Ld7/x$d$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ld7/x$d$b;->n:Ld7/x$d$b;

    const/4 v7, 0x4

    new-array v7, v7, [Ld7/x$d$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ld7/x$d$b;->p:[Ld7/x$d$b;

    new-instance v0, Ld7/x$d$b$a;

    invoke-direct {v0}, Ld7/x$d$b$a;-><init>()V

    sput-object v0, Ld7/x$d$b;->o:Lcom/google/protobuf/d0$d;

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

    iput p3, p0, Ld7/x$d$b;->j:I

    return-void
.end method

.method public static b(I)Ld7/x$d$b;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Ld7/x$d$b;->m:Ld7/x$d$b;

    return-object p0

    :cond_1
    sget-object p0, Ld7/x$d$b;->l:Ld7/x$d$b;

    return-object p0

    :cond_2
    sget-object p0, Ld7/x$d$b;->k:Ld7/x$d$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ld7/x$d$b;
    .locals 1

    const-class v0, Ld7/x$d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld7/x$d$b;

    return-object p0
.end method

.method public static values()[Ld7/x$d$b;
    .locals 1

    sget-object v0, Ld7/x$d$b;->p:[Ld7/x$d$b;

    invoke-virtual {v0}, [Ld7/x$d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld7/x$d$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Ld7/x$d$b;->n:Ld7/x$d$b;

    if-eq p0, v0, :cond_0

    iget v0, p0, Ld7/x$d$b;->j:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
