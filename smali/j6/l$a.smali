.class public final enum Lj6/l$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj6/l$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lj6/l$a;

.field public static final enum l:Lj6/l$a;

.field private static final synthetic m:[Lj6/l$a;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lj6/l$a;

    const-string v1, "AND"

    const/4 v2, 0x0

    const-string v3, "and"

    invoke-direct {v0, v1, v2, v3}, Lj6/l$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lj6/l$a;->k:Lj6/l$a;

    new-instance v1, Lj6/l$a;

    const-string v3, "OR"

    const/4 v4, 0x1

    const-string v5, "or"

    invoke-direct {v1, v3, v4, v5}, Lj6/l$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lj6/l$a;->l:Lj6/l$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lj6/l$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lj6/l$a;->m:[Lj6/l$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lj6/l$a;->j:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj6/l$a;
    .locals 1

    const-class v0, Lj6/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj6/l$a;

    return-object p0
.end method

.method public static values()[Lj6/l$a;
    .locals 1

    sget-object v0, Lj6/l$a;->m:[Lj6/l$a;

    invoke-virtual {v0}, [Lj6/l$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj6/l$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj6/l$a;->j:Ljava/lang/String;

    return-object v0
.end method
