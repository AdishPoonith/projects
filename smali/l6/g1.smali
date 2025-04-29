.class public final enum Ll6/g1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll6/g1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ll6/g1;

.field public static final enum k:Ll6/g1;

.field public static final enum l:Ll6/g1;

.field private static final synthetic m:[Ll6/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll6/g1;

    const-string v1, "LISTEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll6/g1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll6/g1;->j:Ll6/g1;

    new-instance v1, Ll6/g1;

    const-string v3, "EXISTENCE_FILTER_MISMATCH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll6/g1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll6/g1;->k:Ll6/g1;

    new-instance v3, Ll6/g1;

    const-string v5, "LIMBO_RESOLUTION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll6/g1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll6/g1;->l:Ll6/g1;

    const/4 v5, 0x3

    new-array v5, v5, [Ll6/g1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll6/g1;->m:[Ll6/g1;

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

.method public static valueOf(Ljava/lang/String;)Ll6/g1;
    .locals 1

    const-class v0, Ll6/g1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll6/g1;

    return-object p0
.end method

.method public static values()[Ll6/g1;
    .locals 1

    sget-object v0, Ll6/g1;->m:[Ll6/g1;

    invoke-virtual {v0}, [Ll6/g1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll6/g1;

    return-object v0
.end method
