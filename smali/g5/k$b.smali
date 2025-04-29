.class public final enum Lg5/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg5/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lg5/k$b;

.field public static final enum k:Lg5/k$b;

.field public static final enum l:Lg5/k$b;

.field public static final enum m:Lg5/k$b;

.field private static final synthetic n:[Lg5/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lg5/k$b;

    const-string v1, "TINK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg5/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg5/k$b;->j:Lg5/k$b;

    new-instance v1, Lg5/k$b;

    const-string v3, "LEGACY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg5/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg5/k$b;->k:Lg5/k$b;

    new-instance v3, Lg5/k$b;

    const-string v5, "RAW"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lg5/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg5/k$b;->l:Lg5/k$b;

    new-instance v5, Lg5/k$b;

    const-string v7, "CRUNCHY"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lg5/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lg5/k$b;->m:Lg5/k$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lg5/k$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lg5/k$b;->n:[Lg5/k$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg5/k$b;
    .locals 1

    const-class v0, Lg5/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg5/k$b;

    return-object p0
.end method

.method public static values()[Lg5/k$b;
    .locals 1

    sget-object v0, Lg5/k$b;->n:[Lg5/k$b;

    invoke-virtual {v0}, [Lg5/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg5/k$b;

    return-object v0
.end method
