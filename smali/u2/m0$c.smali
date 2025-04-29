.class final Lu2/m0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Ls1/n1;

.field public final b:Lw1/y$b;


# direct methods
.method private constructor <init>(Ls1/n1;Lw1/y$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/m0$c;->a:Ls1/n1;

    iput-object p2, p0, Lu2/m0$c;->b:Lw1/y$b;

    return-void
.end method

.method synthetic constructor <init>(Ls1/n1;Lw1/y$b;Lu2/m0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/m0$c;-><init>(Ls1/n1;Lw1/y$b;)V

    return-void
.end method
