.class public final enum Lp8/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp8/a$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lp8/a$d;

.field public static final enum l:Lp8/a$d;

.field public static final enum m:Lp8/a$d;

.field public static final enum n:Lp8/a$d;

.field private static final synthetic o:[Lp8/a$d;


# instance fields
.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lp8/a$d;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lp8/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lp8/a$d;->k:Lp8/a$d;

    new-instance v1, Lp8/a$d;

    const-string v3, "FOLD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lp8/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lp8/a$d;->l:Lp8/a$d;

    new-instance v3, Lp8/a$d;

    const-string v5, "HINGE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lp8/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lp8/a$d;->m:Lp8/a$d;

    new-instance v5, Lp8/a$d;

    const-string v7, "CUTOUT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lp8/a$d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lp8/a$d;->n:Lp8/a$d;

    const/4 v7, 0x4

    new-array v7, v7, [Lp8/a$d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lp8/a$d;->o:[Lp8/a$d;

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

    iput p3, p0, Lp8/a$d;->j:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp8/a$d;
    .locals 1

    const-class v0, Lp8/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp8/a$d;

    return-object p0
.end method

.method public static values()[Lp8/a$d;
    .locals 1

    sget-object v0, Lp8/a$d;->o:[Lp8/a$d;

    invoke-virtual {v0}, [Lp8/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp8/a$d;

    return-object v0
.end method
