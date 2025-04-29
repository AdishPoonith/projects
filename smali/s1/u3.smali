.class public final synthetic Ls1/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/t3;


# direct methods
.method public synthetic constructor <init>(Ls1/t3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/u3;->j:Ls1/t3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls1/u3;->j:Ls1/t3;

    invoke-static {v0}, Ls1/t3$c;->a(Ls1/t3;)V

    return-void
.end method
