.class public final enum Lo6/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo6/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lo6/a$c;

.field public static final enum l:Lo6/a$c;

.field public static final enum m:Lo6/a$c;

.field public static final enum n:Lo6/a$c;

.field private static final synthetic o:[Lo6/a$c;


# instance fields
.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lo6/a$c;

    const-string v1, "NO_DOCUMENT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo6/a$c;->k:Lo6/a$c;

    new-instance v1, Lo6/a$c;

    const-string v4, "DOCUMENT"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lo6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lo6/a$c;->l:Lo6/a$c;

    new-instance v4, Lo6/a$c;

    const-string v6, "UNKNOWN_DOCUMENT"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lo6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lo6/a$c;->m:Lo6/a$c;

    new-instance v6, Lo6/a$c;

    const-string v8, "DOCUMENTTYPE_NOT_SET"

    invoke-direct {v6, v8, v7, v2}, Lo6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lo6/a$c;->n:Lo6/a$c;

    const/4 v8, 0x4

    new-array v8, v8, [Lo6/a$c;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Lo6/a$c;->o:[Lo6/a$c;

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

    iput p3, p0, Lo6/a$c;->j:I

    return-void
.end method

.method public static b(I)Lo6/a$c;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lo6/a$c;->m:Lo6/a$c;

    return-object p0

    :cond_1
    sget-object p0, Lo6/a$c;->l:Lo6/a$c;

    return-object p0

    :cond_2
    sget-object p0, Lo6/a$c;->k:Lo6/a$c;

    return-object p0

    :cond_3
    sget-object p0, Lo6/a$c;->n:Lo6/a$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lo6/a$c;
    .locals 1

    const-class v0, Lo6/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo6/a$c;

    return-object p0
.end method

.method public static values()[Lo6/a$c;
    .locals 1

    sget-object v0, Lo6/a$c;->o:[Lo6/a$c;

    invoke-virtual {v0}, [Lo6/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo6/a$c;

    return-object v0
.end method
