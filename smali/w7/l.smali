.class final enum Lw7/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum l:Lw7/l;

.field public static final enum m:Lw7/l;

.field private static final synthetic n:[Lw7/l;


# instance fields
.field final j:Lw7/n;

.field final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lw7/l;

    sget-object v1, Lw7/j;->a:Lw7/j;

    const-string v2, "AES_CBC_PKCS7Padding"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lw7/l;-><init>(Ljava/lang/String;ILw7/n;I)V

    sput-object v0, Lw7/l;->l:Lw7/l;

    new-instance v1, Lw7/l;

    sget-object v2, Lw7/k;->a:Lw7/k;

    const-string v5, "AES_GCM_NoPadding"

    const/16 v6, 0x17

    invoke-direct {v1, v5, v4, v2, v6}, Lw7/l;-><init>(Ljava/lang/String;ILw7/n;I)V

    sput-object v1, Lw7/l;->m:Lw7/l;

    const/4 v2, 0x2

    new-array v2, v2, [Lw7/l;

    aput-object v0, v2, v3

    aput-object v1, v2, v4

    sput-object v2, Lw7/l;->n:[Lw7/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILw7/n;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/n;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lw7/l;->j:Lw7/n;

    iput p4, p0, Lw7/l;->k:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw7/l;
    .locals 1

    const-class v0, Lw7/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/l;

    return-object p0
.end method

.method public static values()[Lw7/l;
    .locals 1

    sget-object v0, Lw7/l;->n:[Lw7/l;

    invoke-virtual {v0}, [Lw7/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/l;

    return-object v0
.end method
