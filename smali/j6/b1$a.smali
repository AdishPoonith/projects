.class public final enum Lj6/b1$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj6/b1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lj6/b1$a;

.field public static final enum k:Lj6/b1$a;

.field private static final synthetic l:[Lj6/b1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj6/b1$a;

    const-string v1, "LIMIT_TO_FIRST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj6/b1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj6/b1$a;->j:Lj6/b1$a;

    new-instance v1, Lj6/b1$a;

    const-string v3, "LIMIT_TO_LAST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj6/b1$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj6/b1$a;->k:Lj6/b1$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lj6/b1$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lj6/b1$a;->l:[Lj6/b1$a;

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

.method public static valueOf(Ljava/lang/String;)Lj6/b1$a;
    .locals 1

    const-class v0, Lj6/b1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj6/b1$a;

    return-object p0
.end method

.method public static values()[Lj6/b1$a;
    .locals 1

    sget-object v0, Lj6/b1$a;->l:[Lj6/b1$a;

    invoke-virtual {v0}, [Lj6/b1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj6/b1$a;

    return-object v0
.end method
