.class final enum Lk9/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk9/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lk9/j$a;

.field public static final enum k:Lk9/j$a;

.field private static final synthetic l:[Lk9/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lk9/j$a;

    const-string v1, "INBOUND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk9/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk9/j$a;->j:Lk9/j$a;

    new-instance v1, Lk9/j$a;

    const-string v3, "OUTBOUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk9/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk9/j$a;->k:Lk9/j$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lk9/j$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lk9/j$a;->l:[Lk9/j$a;

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

.method public static valueOf(Ljava/lang/String;)Lk9/j$a;
    .locals 1

    const-class v0, Lk9/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk9/j$a;

    return-object p0
.end method

.method public static values()[Lk9/j$a;
    .locals 1

    sget-object v0, Lk9/j$a;->l:[Lk9/j$a;

    invoke-virtual {v0}, [Lk9/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk9/j$a;

    return-object v0
.end method
