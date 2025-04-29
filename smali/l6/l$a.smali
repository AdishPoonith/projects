.class public final enum Ll6/l$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll6/l$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ll6/l$a;

.field public static final enum k:Ll6/l$a;

.field public static final enum l:Ll6/l$a;

.field private static final synthetic m:[Ll6/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll6/l$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll6/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll6/l$a;->j:Ll6/l$a;

    new-instance v1, Ll6/l$a;

    const-string v3, "PARTIAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll6/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll6/l$a;->k:Ll6/l$a;

    new-instance v3, Ll6/l$a;

    const-string v5, "FULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll6/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll6/l$a;->l:Ll6/l$a;

    const/4 v5, 0x3

    new-array v5, v5, [Ll6/l$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll6/l$a;->m:[Ll6/l$a;

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

.method public static valueOf(Ljava/lang/String;)Ll6/l$a;
    .locals 1

    const-class v0, Ll6/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll6/l$a;

    return-object p0
.end method

.method public static values()[Ll6/l$a;
    .locals 1

    sget-object v0, Ll6/l$a;->m:[Ll6/l$a;

    invoke-virtual {v0}, [Ll6/l$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll6/l$a;

    return-object v0
.end method
