.class public final synthetic Ls1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/d$a;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ls1/d$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/c;->j:Ls1/d$a;

    iput p2, p0, Ls1/c;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/c;->j:Ls1/d$a;

    iget v1, p0, Ls1/c;->k:I

    invoke-static {v0, v1}, Ls1/d$a;->a(Ls1/d$a;I)V

    return-void
.end method
