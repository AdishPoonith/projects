.class Li9/x0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/x0;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Li9/w0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Li9/x0;


# direct methods
.method constructor <init>(Li9/x0;)V
    .locals 0

    iput-object p1, p0, Li9/x0$a;->j:Li9/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/w0;Li9/w0;)I
    .locals 0

    invoke-virtual {p1}, Li9/w0;->c()I

    move-result p1

    invoke-virtual {p2}, Li9/w0;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Li9/w0;

    check-cast p2, Li9/w0;

    invoke-virtual {p0, p1, p2}, Li9/x0$a;->a(Li9/w0;Li9/w0;)I

    move-result p1

    return p1
.end method
