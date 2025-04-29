.class final Ls9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/g;

    invoke-direct {v0}, Ls9/g;-><init>()V

    sput-object v0, Ls9/g;->a:Ls9/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Ls9/f;
    .locals 4

    new-instance v0, Ls9/f;

    const/4 v1, 0x1

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ls9/f;-><init>(III)V

    return-object v0
.end method
