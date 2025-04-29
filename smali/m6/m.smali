.class public final synthetic Lm6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic j:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/m;->j:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lm6/m;->j:Ljava/util/Comparator;

    check-cast p1, Lm6/i;

    check-cast p2, Lm6/i;

    invoke-static {v0, p1, p2}, Lm6/n;->b(Ljava/util/Comparator;Lm6/i;Lm6/i;)I

    move-result p1

    return p1
.end method
