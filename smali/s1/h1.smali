.class public final synthetic Ls1/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/t;


# instance fields
.field public final synthetic j:Ls1/j1;


# direct methods
.method public synthetic constructor <init>(Ls1/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/h1;->j:Ls1/j1;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/h1;->j:Ls1/j1;

    invoke-static {v0}, Ls1/j1;->e(Ls1/j1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
